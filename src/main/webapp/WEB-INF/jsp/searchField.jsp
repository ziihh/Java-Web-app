<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<jstl:url value='/resources/CSS/WordsForm.css '/>" rel="stylesheet" />
</head>
<body>

    <h2>Search words</h2>
    <div class="search_field" >
        <input type="search" name="search" id="search" />
        <input type="submit" name="submit" value="search" />
        <div id="DropDownSearchContainer"></div>
    </div>
    <div class="line"/>

</body>
</html>