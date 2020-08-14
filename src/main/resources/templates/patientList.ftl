<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h1>VONO ROBIT`</h1>
<div>
    <table class="table table-striped table-dark">
        <tr>
            <th>Name</th>
            <th>Surname </th>
            <th>birthDate</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.surname}</td>
                <td>${item.birthDate}</td>
                <<td><a href="http://localhost:8081/web/patient/update/${item.id}">
                        <input type="button" value="update">
                    </a></td>
                <td><a href="http://localhost:8081/web/patient/delete/${item.id}">
                        <input type="button" value="delete">
                    </a> </td>
            </tr>
        </#list>
    </table>
<
    <div><a href="http://localhost:8081/web/patient/create/">
            <input type="button" value="create">
        </a>
    </div>

</div>
</body>
</html>