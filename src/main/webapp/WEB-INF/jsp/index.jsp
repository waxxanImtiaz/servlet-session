<%--
  Created by IntelliJ IDEA.
  User: Imtiaz
  Date: 10/31/2020
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Register yourself</h1>
<%! String name = "Test Project";

    public String printName(){
        return  this.name;
    }
%>
<%=printName() %>
<form method="post" action="register">
    <table>
        <tr>
            <td>
                Name:
            </td>
            <td>
                <label>
                    <input type="text" name="name">
                </label>
            </td>
        </tr>
        <tr>
            <td>
                Email:
            </td>
            <td>
                <label>
                    <input type="text" name="email">
                </label>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Sumbit">
            </td>
        </tr>
    </table>

</form>




</body>
</html>
