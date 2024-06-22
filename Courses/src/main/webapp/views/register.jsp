<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background: linear-gradient(90deg, #00d2ff 0%, #3a47d5 100%);
        }

        * {
            box-sizing: border-box;
        }

        /* Add padding to containers */
        .container {
            padding: 16px;
            background-color: white;
        }

        /* Full-width input fields */
        input[type=text],
        input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus,
        input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        /* Overwrite default styles of hr */
        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for the submit button */
        .registerbtn {
            background-color: black;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .registerbtn:hover {
            opacity: 1;
        }

        /* Add a blue text color to links */
        a {
            color: dodgerblue;
        }

        /* Set a grey background color and center the text of the "sign in" section */
        .signin {
            background-color: #f1f1f1;
            text-align: center;
        }
    </style>
</head>
<body bgcolor="olive">
    <h2>${msg}</h2>

    <form action="register" class="text-center" method="post">
        <div class="container">
            <h1>Register Here</h1>
            <p>Please fill in this form to create an account.</p>
            <hr>

            <label for="name"><b>Name</b></label>
            <input type="text" placeholder="Enter Name" name="name" id="name" required><br>
            <%-- Display name validation error message --%>
            <c:if test="${not empty nameError}">
                <p class="error-msg">${nameError}</p>
            </c:if>

            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" id="email" required><br>
            <%-- Display email validation error message --%>
            <c:if test="${not empty emailError}">
                <p class="error-msg">${emailError}</p>
            </c:if>

            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" id="username" required><br>
            <%-- Display username validation error message --%>
            <c:if test="${not empty usernameError}">
                <p class="error-msg">${usernameError}</p>
            </c:if>

            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" id="psw" required><br>
            <hr>

            <button type="submit" class="registerbtn">Register</button><br>
        </div>
    </form>
</body>
</html>
