<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<jstl:url value='/resources/CSS/wordDetail.css '/>" rel="stylesheet" />
    <script src="<jstl:url value='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js' />"></script>
    <script src="<jstl:url value='/resources/JS/SearchField.js' />"></script>
</head>
<body>

    <div class="blueBorder">
        <button class="PreviousPage">&laquo; Previous</button>
    </div>
    <div class="main">
        <h1>Search Result: ${Word}</h1>
        <div class="line"></div>

    </div>
    <p>Definition: ${Definition}</p>
    <p>Example: ${Example}</p>
    <p>Second Example: ${SecondExample}</p>


</body>
</html>