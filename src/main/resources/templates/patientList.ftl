<#--<#import "/spring.ftl" as spring/>
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
            <th>birthDate</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
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
</html>-->

<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Admin panel for clinic</title>
    <#include "cssImports.ftl">
</head>
<body class="sb-nav-fixed">
<#include "header.ftl">
<#include "sideNav.ftl">
<div id="layoutSidenav_content">
    <main>
        <div class="container-fluid">
            <h1 class="mt-4">Tables</h1>
            <ol class="breadcrumb mb-4">
                <li class="breadcrumb-item"><a href="<@spring.url '../../index.html'></@spring.url>">Dashboard</a></li>
                <li class="breadcrumb-item active">Patient table</li>
            </ol>
            <div class="card mb-4">
                <div class="card-body">
                    Place for chart
                    <!-- Area chart example -->
                </div>
            </div>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                    DataTable Example
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="myTableTest" width="100%" cellspacing="0">
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>BirthDate</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                            </thead>
                            <tbody>
                            <#list list as item>
                                <tr>
                                    <td>${item.name}</td>
                                    <td>${item.birthDate}</td>
                                    <td><a href="http://localhost:8081/web/patient/update/${item.id}">
                                            <input type="button" value="update">
                                        </a></td>
                                    <td><a href="http://localhost:8081/web/patient/delete/${item.id}">
                                            <input type="button" value="delete">
                                        </a> </td>
                                </tr>
                            </#list>
                            </tbody>
                        </table>
                    </div>
                    <div><a href="http://localhost:8081/web/patient/create/">
                            <input type="button" value="create">
                        </a>
                    </div>
                </div>
                <div>
                    <#include "footer.ftl">
                </div>
            </div>
    </main>
</div>
</div>
</body>
<#include "scripts.ftl">
</html>

