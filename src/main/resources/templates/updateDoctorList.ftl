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
        <legend>Update doctor value</legend>
        <form name="doctor" action="" method="POST">
            Name:<@spring.formInput "doctorForm.name" "" "text"/>
            <br>
            Speciality:<@spring.formInput "doctorForm.speciality" "" "text"/>
            <br>
            Category:<@spring.formInput "doctorForm.category" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>