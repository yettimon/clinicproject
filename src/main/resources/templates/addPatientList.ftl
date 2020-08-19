<#import "/spring.ftl" as spring/>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Admin panel for clinic</title>
    <#include "cssImports.ftl">
</head>
<#include "header.ftl">
<#include "sideNav.ftl">
<div id="layoutSidenav_content">
    <div class="card mb-4 align-content-md-center">
        <div class="card-header text-center">
            <i class="fas fa-table mr-1"></i>
            Creating doctors form
        </div>
        <div class="card-body">
            <form name="Doctor" action="" method="POST">
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Name</label>
                        <@spring.formInput "patientForm.name" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input patient name here.</small>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Birth Date</label>
                        <@spring.formInput "patientForm.birthDate" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input patient birth date.</small>
                    </div>
                </div>
                <input type="submit" value="Create"/>
            </form>
        </div>
    </div>

    <#include "footer.ftl">
</div>



</div>

<div class="scripts">
    <#include "scripts.ftl">
</div>

</body>
</html>


