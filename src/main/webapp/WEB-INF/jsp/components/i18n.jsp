<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="lang" scope="session" value="${not empty sessionScope.lang ? sessionScope.lang : 'en_US'}" />
<fmt:setLocale value="${lang}" scope="session"/>
<fmt:setBundle basename="localization.lang" var="rb" scope="session" />