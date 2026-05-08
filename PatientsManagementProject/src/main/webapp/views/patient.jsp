<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Patient Management</title>

    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #eef2f3, #dfe9f3);
        }

        /* Header */
        .header {
            background: #34495e;
            color: white;
            padding: 18px;
            text-align: center;
            font-size: 24px;
            letter-spacing: 1px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.2);
        }

        .container {
            padding: 25px;
        }

        /* Form Card */
        .form-box {
            background: white;
            padding: 25px;
            border-radius: 12px;
            width: 400px;
            margin-bottom: 30px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            transition: 0.3s;
        }

        .form-box:hover {
            transform: translateY(-3px);
        }

        .form-box h3 {
            margin-bottom: 15px;
            color: #333;
        }

        .form-box input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border-radius: 6px;
            border: 1px solid #ccc;
            outline: none;
            transition: 0.2s;
        }

        .form-box input:focus {
            border-color: #1abc9c;
            box-shadow: 0 0 5px rgba(26,188,156,0.5);
        }

        .btn {
            background: linear-gradient(45deg, #1abc9c, #16a085);
            color: white;
            padding: 10px;
            border: none;
            cursor: pointer;
            border-radius: 6px;
            width: 100%;
            font-size: 15px;
        }

        .btn:hover {
            opacity: 0.9;
        }

        /* Table */
        table {
            width: 100%;
            background: white;
            border-collapse: collapse;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 6px 15px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 14px;
            text-align: center;
        }

        th {
            background: #34495e;
            color: white;
        }

        tr:hover {
            background: #f2f2f2;
        }

        /* Action Buttons */
        .action-btn {
            padding: 6px 12px;
            text-decoration: none;
            border-radius: 6px;
            color: white;
            font-size: 13px;
        }

        .edit {
            background: #3498db;
        }

        .edit:hover {
            background: #2980b9;
        }

        .delete {
            background: #e74c3c;
        }

        .delete:hover {
            background: #c0392b;
        }

        /* Success Message */
        .success {
            color: green;
            font-weight: bold;
            margin-bottom: 10px;
        }

    </style>
</head>

<body>

<div class="header">
    🏥 Patient Management System
</div>

<div class="container">

    <!-- Add Patient Form -->
    <div class="form-box">
        <h3>➕ Add Patient</h3>

        <% if(request.getAttribute("sucess") != null){ %>
            <p class="success">
                <%= request.getAttribute("sucess") %>
            </p>
        <% } %>

        <form action="/savePatient" method="post">
            <input type="text" name="name" placeholder="👤 Enter Name" required>
            <input type="number" name="age" placeholder="🎂 Enter Age" required>
            <input type="text" name="gender" placeholder="⚧ Enter Gender" required>
            <input type="text" name="disease" placeholder="🩺 Enter Disease" required>

            <button type="submit" class="btn">Save Patient</button>
        </form>
    </div>

    <%@ page import="java.util.List" %>
    <%@ page import="in.h.entity.Patient" %>

    <!-- Patient List -->
    <h3>📋 Patient List</h3>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Disease</th>
            <th>Action</th>
        </tr>

        <%
            List<Patient> list = (List<Patient>) request.getAttribute("list");

            if(list != null){
                for(Patient p : list){
        %>

        <tr>
            <td><%= p.getPid() %></td>
            <td><%= p.getName() %></td>
            <td><%= p.getAge() %></td>
            <td><%= p.getGender() %></td>
            <td><%= p.getDisease() %></td>
            <td>
                <a href="/editPatient?id=<%= p.getPid() %>" class="action-btn edit">Edit</a>
                <a href="deletePatient?id=<%= p.getPid() %>"
                   onclick="return confirm('Are you sure you want to delete this patient?')"
                   class="action-btn delete">Delete</a>
            </td>
        </tr>

        <%
                }
            }
        %>

    </table>

</div>

</body>
</html>