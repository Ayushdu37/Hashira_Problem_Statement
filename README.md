<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Hashira Problem Statement</title>
</head>
<body>

<h1>Hashira Problem Statement</h1>

<p>
  <strong>Hashira</strong> is a modular Java project designed to solve a challenge inspired by the Shamir’s Secret Sharing algorithm. It focuses on reconstructing a secret (constant term <code>c</code> in a polynomial) from encoded roots using Lagrange interpolation. The solution avoids using external math libraries and is structured for clarity, reusability, and performance with large integers.
</p>

<hr>

<h2>🛠 Tech Stack</h2>

<h3>Core</h3>
<ul>
  <li><strong>Language:</strong> Java</li>
  <li><strong>Tools:</strong> IntelliJ IDEA / VS Code (any Java-compatible IDE)</li>
  <li><strong>Libraries:</strong>
    <ul>
      <li><code>java.math.BigInteger</code> (for handling large numbers)</li>
      <li><code>org.json.simple</code> (for parsing JSON input files)</li>
    </ul>
  </li>
</ul>

<hr>

<h2>📁 Project Structure</h2>

<pre>
com/shamir/
├── Main.java               # Entry point: scans and solves testcases
├── SecretSolver.java       # Core logic to parse input and solve using interpolation
├── Lagrange.java           # Lagrange interpolation at x=0
├── BigMath.java            # Utility for big number math operations
└── CombinationUtil.java    # Recursive k-combination generator
</pre>

<hr>

<h2>🚀 How to Run</h2>

<ol>
  <li><strong>Clone the repository:</strong>
    <pre><code>git clone https://github.com/your-username/hashira-secret-solver.git
cd hashira-secret-solver</code></pre>
  </li>

  <li><strong>Add your JSON test case files</strong><br>
      Place test cases like <code>testcase1.json</code>, <code>testcase2.json</code>, etc., in the root directory.
  </li>

  <li><strong>Compile the Java source code:</strong>
    <pre><code>javac com/shamir/*.java</code></pre>
  </li>

  <li><strong>Run the program:</strong>
    <pre><code>java com.shamir.Main</code></pre>
  </li>
</ol>


<h2>🔍 Features</h2>

<ul>
  <li>✅ Decodes values from custom number bases (binary, octal, hex, etc.)</li>
  <li>✅ Handles large numbers using <code>BigInteger</code></li>
  <li>✅ Calculates Lagrange interpolation at x = 0</li>
  <li>✅ Automatically processes all test case files named <code>testcase*.json</code></li>
  <li>✅ Uses recursive combination generator to cover all possible k-sized subsets</li>
</ul>

<hr>

<h2>🧠 Concepts Applied</h2>
<ul>
  <li>Lagrange Polynomial Interpolation</li>
  <li>Big Number Arithmetic (256-bit scale)</li>
  <li>JSON File I/O</li>
  <li>Recursion &amp; Combination Generation</li>
  <li>Modular Java Design</li>
</ul>

<hr>

<h2>📝 License</h2>

<p>
  MIT License <em>(or replace with your preferred license)</em>
</p>

<hr>

<h2>🤝 Contributions</h2>

<p>
  Feel free to open a pull request if you'd like to contribute, fix bugs, or improve performance.
</p>

<hr>

<h2>🙌 Special Thanks</h2>

<p>
  This project is based on a placement round problem statement. Special thanks to the organizers for the creative challenge!
</p>

</body>
</html>
