<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<c:url value='/resources/CSS/index.css '/>" rel="stylesheet" />
    <script src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js' />"></script>
    <script src="<c:url value='/resources/JS/addField.js' />"></script>
</head>
<body>
<h1>Add or search any word</h1>
<div>
   <form action="/index" id="addWords">
        Word
        <input type="text" name="word" />
        Definition
       <input type="text" name="definition" />
       Example
       <input type="text" name="example" />
       <button id="add" type="button"> add more example </button>
   </form>
</div>

<div>
    <input type="search">
    <button>Search</button>
</div>
</body>
</html>