<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<jstl:url value='/resources/CSS/WordsForm.css '/>" rel="stylesheet" />
    <script src="<jstl:url value='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js' />"></script>
    <script src="<jstl:url value='/resources/JS/SearchField.js' />"></script>
</head>
<body>
    <div class="search_field">
        <h2>Search words</h2>
            <input type="search" name="search" id="search" />
            <input type="submit" name="submit" value="search" />
        <div class="line"/>
    </div>
</body>
</html>
