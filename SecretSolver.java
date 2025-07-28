import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class SecretSolver {
    private final String filePath;
    private Map<Integer, String> xMap = new HashMap<>();
    private Map<Integer, String> yMap = new HashMap<>();
    private int k;

    public SecretSolver(String filePath) {
        this.filePath = filePath;
    }

    public String solve() throws Exception {
        parseInput();
        List<List<Integer>> combos = new ArrayList<>();
        List<Integer> keysList = new ArrayList<>(xMap.keySet());
        CombinationUtil.generate(keysList, 0, k, new ArrayList<>(), combos);

        Map<String, Integer> resultCount = new HashMap<>();
        for (List<Integer> combo : combos) {
            List<String> xVals = new ArrayList<>();
            List<String> yVals = new ArrayList<>();
            for (int x : combo) {
                xVals.add(xMap.get(x));
                yVals.add(yMap.get(x));
            }
            String secret = Lagrange.solveAtZero(xVals, yVals);
            if (secret != null) {
                resultCount.put(secret, resultCount.getOrDefault(secret, 0) + 1);
            }
        }

        String answer = "Unable to reconstruct secret.";
        int max = 0;
        for (Map.Entry<String, Integer> entry : resultCount.entrySet()) {
            if (entry.getValue() > max) {
                answer = entry.getKey();
                max = entry.getValue();
            }
        }
        return answer;
    }

    private void parseInput() throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(new FileReader(filePath));
        JSONObject keys = (JSONObject) obj.get("keys");
        k = Integer.parseInt(keys.get("k").toString());

        for (Object keyObj : obj.keySet()) {
            String keyStr = keyObj.toString();
            if (keyStr.equals("keys")) continue;

            int x = Integer.parseInt(keyStr);
            JSONObject valueObj = (JSONObject) obj.get(keyStr);
            int base = Integer.parseInt(valueObj.get("base").toString());
            String encoded = valueObj.get("value").toString();

            try {
                String y = new java.math.BigInteger(encoded, base).toString();
                xMap.put(x, Integer.toString(x));
                yMap.put(x, y);
            } catch (Exception e) {
                // Skip invalid entry
            }
        }
    }
}
