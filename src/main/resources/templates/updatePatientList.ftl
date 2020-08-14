<#import "/spring.ftl" as spring/>
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
            Surname:<@spring.formInput "patientForm.surname" "" "text"/>
            <br>
            BirthDate:<@spring.formInput "patientForm.birthDate" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>