<#--
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h1> </h1>
<div>
    <table class="table table-striped table-dark">
        <tr>
            <th>Doctor</th>
            <th>Patient </th>
            <th>Date of review</th>
            <th>Diagnose</th>
            <th>Price</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.doctor.name}</td>
                <td>${item.patient.name}</td>
                <td>${item.dateOfReview}</td>
                <td>${item.diagnose}</td>
                <td>${item.price}</td>
                -<td><a href="http://localhost:8081/web/review/update/${item.id}">
                        <input type="button" value="update">
                    </a></td>
                <td><a href="http://localhost:8081/web/review/delete/${item.id}">
                        <input type="button" value="delete">
                    </a> </td>
            </tr>
        </#list>
    </table>
<
    <div><a href="http://localhost:8081/web/review/create/">
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
    <script>
        // Set new default font family and font color to mimic Bootstrap's default styling
        // Bar Chart Example
        var ctx = document.getElementById("myBarChart1");
        var reviewPrice=[<#list list as item>${item.price},</#list>]
        var diagnosePrice=[<#list list as item>"${item.diagnose}",</#list>]
        var myLineChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: [diagnosePrice],
                datasets: [{
                    label: "Revenue",
                    backgroundColor: "rgba(2,117,216,1)",
                    borderColor: "rgba(2,117,216,1)",
                    data: [reviewPrice],
                }],
            },
            options: {
                scales: {
                    xAxes: [{
                        time: {
                            unit: 'month'
                        },
                        gridLines: {
                            display: false
                        },
                        ticks: {
                            maxTicksLimit: 6
                        }
                    }],
                    yAxes: [{
                        ticks: {
                            min: 0,
                            max: 15000,
                            maxTicksLimit: 5
                        },
                        gridLines: {
                            display: true
                        }
                    }],
                },
                legend: {
                    display: false
                }
            }
        });
    </script>
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
                    <div class="col-xl-12">
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-chart-bar mr-1"></i>
                                Bar Chart 2
                            </div>
                            <div class="card-body"><canvas id="myBarChart1" width="100%" height="40"></canvas></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                    DataTable Example
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                            <tr>
                                <th>Doctor</th>
                                <th>Patient </th>
                                <th>Date of review</th>
                                <th>Diagnose</th>
                                <th>Price</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                            </thead>
                            <tbody>
                            <#list list as item>
                                <tr>
                                    <td>${item.doctor.name}</td>
                                    <td>${item.patient.name}</td>
                                    <td>${item.dateOfReview}</td>
                                    <td>${item.diagnose}</td>
                                    <td>${item.price}</td>
                                    -<td><a href="http://localhost:8081/web/review/update/${item.id}">
                                            <input type="button" value="update">
                                        </a></td>
                                    <td><a href="http://localhost:8081/web/review/delete/${item.id}">
                                            <input type="button" value="delete">
                                        </a> </td>
                                </tr>
                            </#list>
                            </tbody>
                        </table>
                    </div>
                    <div><a href="http://localhost:8081/web/review/create/">
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


