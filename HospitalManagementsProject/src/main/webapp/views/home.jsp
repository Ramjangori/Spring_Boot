<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard - E-Hospital</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial;
        }

        body {
            display: flex;
            height: 100vh;
        }

        /* Sidebar */
        .sidebar {
            width: 220px;
            background: #2c3e50;
            color: white;
            padding: 20px;
        }

        .sidebar h2 {
            margin-bottom: 30px;
        }

        .sidebar a {
            display: block;
            color: white;
            text-decoration: none;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
        }

        .sidebar a:hover {
            background: #1abc9c;
        }

        /* Main */
        .main {
            flex: 1;
            background: #f4f7fb;
            padding: 20px;
        }

        .header {
            background: white;
            padding: 15px;
            border-radius: 8px;
            margin-bottom: 20px;
        }

        .cards {
            display: flex;
            gap: 20px;
        }

        .card {
            flex: 1;
            background: white;
            padding: 20px;
            border-radius: 10px;
            text-align: center;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }

        .card h3 {
            margin-bottom: 10px;
        }

        .btn {
            display: inline-block;
            margin-top: 10px;
            padding: 8px 15px;
            background: #1abc9c;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .btn:hover {
            background: #16a085;
        }
    </style>
</head>

<body>

<!-- Sidebar -->
<div class="sidebar">
    <h2>🏥 E-Hospital</h2>

    <a href="#">Dashboard</a>
    <a href="/patients">Patient Management</a>
    <a href="/doctors">Doctor Management</a>
    <a href="/appointments">Appointments</a>
    <a href="/logout">Logout</a>
</div>

<!-- Main Content -->
<div class="main">

    <div class="header">
        <h2>Welcome, Admin 👋</h2>
    </div>

    <div class="cards">

        <div class="card">
            <h3>Patients</h3>
            <p>Manage patient records</p>
            <a href="/patients" class="btn">Go</a>
        </div>

        <div class="card">
            <h3>Doctors</h3>
            <p>Manage doctors</p>
            <a href="/doctors" class="btn">Go</a>
        </div>

        <div class="card">
            <h3>Appointments</h3>
            <p>Assign doctor to patient</p>
            <a href="/appointments" class="btn">Go</a>
        </div>

    </div>

</div>

</body>
</html>