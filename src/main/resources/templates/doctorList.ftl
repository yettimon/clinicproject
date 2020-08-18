<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Admin panel for clinic</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/styles.css'/>"/>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css'/>"/>
</head>
<body class="sb-nav-fixed">
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark nab">
    <button class="btn btn-link btn-sm order-1 order-lg-0 navbar-button-margin" id="sidebarToggle" href="#"><i class="fas fa-bars"></i></button>
    <a class="navbar-brand" href="index.html">V&D ADMIN</a>
    <!-- Navbar-->
    <ul class="navbar-nav ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="userDropdown" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#"></a>
                <a class="dropdown-item" href="#"></a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="<@spring.url 'login.html'></@spring.url>">Logout</a>
            </div>
        </li>
    </ul>
</nav>
<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
            <div class="sb-sidenav-menu">
                <div class="nav">
                    <div class="sb-sidenav-menu-heading">Core</div>
                    <a class="nav-link" <@spring.url './static/index.html'></@spring.url>>
                        <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                        Main Page
                    </a>
                    <div class="sb-sidenav-menu-heading">Interface</div>
                    <a class="nav-link" href="charts.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                        Graphs
                    </a>
                    <a class="nav-link" href="tables.html">
                        <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                        Tables
                    </a>
                </div>
            </div>
            <div class="sb-sidenav-footer">
                <div class="small">Logged in as:</div>
                $USER
            </div>
        </nav>
    </div>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid">
                <h1 class="mt-4">Tables</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                    <li class="breadcrumb-item active">Tables</li>
                </ol>
                <div class="card mb-4">
                    <div class="card-body">
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
                                        <th>Speciality</th>
                                        <th>Category</th>
                                        <th>Update</th>
                                        <th>Delete</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <#list list as item>
                                        <tr>
                                            <td class="sorting-1">${item.name}</td>
                                            <td>${item.speciality}</td>
                                            <td>${item.category}</td>
                                            <td><a href="http://localhost:8081/web/doctor/update/${item.id}">
                                                    <input type="button" value="update">
                                                </a></td>
                                            <td><a href="http://localhost:8081/web/doctor/delete/${item.id}">
                                                    <input type="button" value="delete">
                                                </a> </td>
                                        </tr>
                                </#list>
        </tbody>
        </table>
    </div>
                        <div><a href="http://localhost:8081/web/doctor/create/">
                                <input type="button" value="create">
                            </a>
                        </div>
</div>
      <footer class="py-4 bg-light mt-auto">
    <div class="container-fluid">
        <div class="d-flex align-items-center justify-content-between small">
            <div class="text-muted">TEST TEST TEST TEST &copy; TESTTESTTESTTESTTEST 2020</div>
        </div>
    </div>
</footer>
                </div>
            </div>
        </main>
    </div>
</div>
</body>
<script  type='text/javascript' src="<@spring.url 'https://code.jquery.com/jquery-3.5.1.min.js' />"></script>
<script  type='text/javascript' src="<@spring.url 'https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js' />"></script>
<script  type='text/javascript' src="<@spring.url 'https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js' />"></script>
<script  type='text/javascript' src="<@spring.url '/js/scripts.js' />"></script>
<script  type='text/javascript' src="<@spring.url 'https://code.jquery.com/jquery-3.5.1.min.js' />"></script>
<script  type='text/javascript' src="<@spring.url 'https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js' />"></script>
<script  type='text/javascript' src="<@spring.url 'https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js' />"></script>
<script  type='text/javascript' src="<@spring.url 'https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js'/>"></script>
<script  type='text/javascript' src="<@spring.url 'https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js'/>"></script>
</html>