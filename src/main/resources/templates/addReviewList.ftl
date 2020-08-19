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
        <legend>Add review</legend>
        <form name="review" action="" method="POST">
            Doctor:<@spring.formSingleSelect "reviewForm.doctor", movs, ""/>
            <br>
            Patient:<@spring.formSingleSelect "reviewForm.patient", movs1, ""/>
            <br>
            Date of Review:<@spring.formInput "reviewForm.dateOfReview" "" "text"/>
            <br>
            Diagnose:<@spring.formInput "reviewForm.Diagnose" "" "text"/>
            <br>
            Price:<@spring.formInput "reviewForm.Price" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>