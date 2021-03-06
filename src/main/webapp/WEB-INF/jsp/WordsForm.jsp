<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<jstl:url value='/resources/CSS/WordsForm.css '/>" rel="stylesheet" />
    <script src="<jstl:url value='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js' />"></script>
    <script src="<jstl:url value='/resources/JS/WordsForm.js' />"></script>
</head>
<body>
    <div class="main">

        <div class="formWrapper">
            <h2>Add new word</h2>

            <font color="red">${errorMessage}</font>
            <form action="/addWords" method="POST" id="addWords">
                Word
                <input type="text" name="word" />
                Definition
               <input type="text" name="definition" />
               Example
               <input type="text" name="example" id="0" />
               <input type="submit" name="submit" value="submit" />
                <button id="add" type="button"> + example </button>
            </form>

        </div>

        <div class="search_field">
            <h2>Search words</h2>
            <input type="search" name="search" />
            <button>Search</button>
            <div class="line"/>
        </div>
    </div>
</body>
</html>