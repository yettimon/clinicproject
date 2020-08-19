<#--<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Update patient value</legend>
        <form name="doctor" action="" method="POST">
            Name:<@spring.formInput "patientForm.name" "" "text"/>
            <br>
            BirthDate:<@spring.formInput "patientForm.birthDate" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>-->

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
            <form name="doctor" action="" method="POST">
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Name</label>
                        <@spring.formInput "patientForm.name" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input patient name here.</small>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Speciality</label>
                        <@spring.formInput "patientForm.birthDate" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input patient birthDate name here.</small>
                    </div>
                </div>
                <input type="submit" value="Update"/>
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

