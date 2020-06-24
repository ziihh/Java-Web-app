<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<jstl:url value='/resources/CSS/home.css '/>" rel="stylesheet" />
</head>
<body>
    <div class="header">
        <div class="blueBorder">
            <a type="button">News</a>
            <a type="button" class="headerAboutDictionaryButton">About dictionary</a>
            <a type="button">Help</a>
        </div>
        <h1>Urban Dictionary</h1>
        <p>Search and add new words in dictionary!</p>
        <form action="/addWordsForm" method="GET" >
            <input type="submit" name="submit" value="add word" />
        </form>
        <font color="red">${error}</font>
        <jstl:out value="${name}"/> this word has been saved.
    </div>
</body>
</html>
