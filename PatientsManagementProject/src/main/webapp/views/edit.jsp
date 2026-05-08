<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Patient</title>

    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #dfe9f3, #ffffff);
        }

        .container {
            width: 420px;
            margin: 60px auto;
            background: #fff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.1);
            transition: 0.3s;
        }

        .container:hover {
            transform: translateY(-3px);
        }

        h2 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 20px;
        }

        label {
            font-weight: 600;
            margin-top: 10px;
            display: block;
            color: #333;
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 6px;
            border-radius: 6px;
            border: 1px solid #ccc;
            outline: none;
            transition: 0.2s;
        }

        input:focus {
            border-color: #3498db;
            box-shadow: 0 0 5px rgba(52,152,219,0.5);
        }

        /* Buttons */
        .btn {
            width: 100%;
            margin-top: 20px;
            padding: 11px;
            background: linear-gradient(45deg, #3498db, #2980b9);
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 15px;
            cursor: pointer;
        }

        .btn:hover {
            opacity: 0.9;
        }

        /* Back Link */
        .back {
            text-align: center;
            margin-top: 15px;
        }

        .back a {
            text-decoration: none;
            color: #555;
            font-weight: 500;
        }

        .back a:hover {
            color: #000;
        }

        /* Error */
        .error {
            color: #e74c3c;
            text-align: center;
            font-weight: bold;
            margin-bottom: 10px;
        }

    </style>
</head>

<body>

<div class="container">
    <h2>✏️ Edit Patient</h2>

    <% if(request.getAttribute("error") != null) { %>
        <p class="error">
            <%= request.getAttribute("error") %>
        </p>
    <% } %>

    <% if(request.getAttribute("success") != null) { %>
    <script>
        alert("✅ Patient Updated Successfully!");
        window.location.href = "/patients"; // 👈 auto redirect
    </script>
    <% } %>

    <form action="/updatePatient" method="post">

        <!-- Hidden ID -->
        <input type="hidden" name="pid" value="${patient.pid}" />

        <label>👤 Name</label>
        <input type="text" name="name" value="${patient.name}" required />

        <label>🎂 Age</label>
        <input type="number" name="age" value="${patient.age}" required />

        <label>⚧ Gender</label>
        <input type="text" name="gender" value="${patient.gender}" required />

        <label>🩺 Disease</label>
        <input type="text" name="disease" value="${patient.disease}" required />

        <button type="submit" class="btn">Update Patient</button>

    </form>

    <div class="back">
        <a href="/patients">⬅ Back to Patient List</a>
    </div>
</div>

</body>
</html>