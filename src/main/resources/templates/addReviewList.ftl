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
                        <label class="form-text">Doctor</label>
                        <@spring.formSingleSelect "reviewForm.doctor", movs, "class='form-control form-control-inline'" />
                        <small id="emailHelp" class="form-text text-muted">Select doctor.</small>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Patient</label>
                        <@spring.formSingleSelect "reviewForm.patient", movs1, "class='form-control form-control-inline'"/>
                        <small id="emailHelp" class="form-text text-muted">Select patient.</small>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Date of Review</label>
                        <@spring.formInput "reviewForm.dateOfReview" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input date of Review.</small>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Diagnose</label>
                        <@spring.formInput "reviewForm.Diagnose" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input patient diagnose.</small>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-12">
                        <label class="form-text">Price</label>
                        <@spring.formInput "reviewForm.Price" "class='form-control form-control-inline'" "text" />
                        <small id="emailHelp" class="form-text text-muted">Input price.</small>
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
