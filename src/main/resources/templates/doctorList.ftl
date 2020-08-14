<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h1>Hello Frontend</h1>
<div>
    <table class="table table-striped table-dark">
        <tr>
            <th>1</th>
            <th>Description </th>
            <th>Chief</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.surname}</td>
                <td>${item.speciality}</td>
                <td>${item.category}</td>
                <#--<td><a href="http://localhost:8081/web/cafedra/updateCafedra/${item.id}">
                        <input type="button" value="update" class="btn-primary">
                    </a></td>
                <td><a href="http://localhost:8081/web/cafedra/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a> </td>-->
            </tr>
        </#list>
    </table>
<#--
    <div><a href="http://localhost:8081/web/cafedra/refresh/">
            <input type="button" value="update" class="btn btn-primary">
        </a>
    </div>-->

</div>
</body>
</html>