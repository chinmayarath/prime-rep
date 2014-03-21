
<%@include file="/taglib.jsp" %>


<html>
<head>
 
Bookmark list
<script type="text/javascript" src="js/contacts.js"></script>
</head>
<body style="font-family: Arial; font-size:smaller;">

 <form action="searchBookMarks" method="post">
 
 <table style="border-collapse: collapse;" width="500" border="0" bordercolor="#006699">
 		<tbody>
 				<tr>     
 					<td>Enter BookMark Title</td>      
 					<td><input name="bookMarkTitle" type="text">
  					<input value="Search" type="submit">
 
  					<input value="New Contact" onclick="javascript:go('saveContact');" type="button">
 
					</td>
				</tr>
		</tbody>
</table>
</form>

<c:if test="${empty SEARCH_BOOKMARKS_RESULTS_KEY}"></c:if>

<c:if test="${! empty SEARCH_BOOKMARKS_RESULTS_KEY}">   
	 <c:foreach var="bookmark" items="${SEARCH_BOOKMARKS_RESULTS_KEY}"></c:foreach>
	 </c:if>
	 
	 <table style="border-collapse: collapse;" width="500" border="1" bordercolor="#006699">
	 <tbody>
	 	<tr bgcolor="lightblue">    
	 	<th>Id</th>    <th>Name</th>       <th>Address</th>     <th>Mobile</th>    <th></th>   
	 	</tr>
		<tr>    
			<td colspan="4">No Results found</td>   
		</tr>
   		<tr>     
   		<td><c:out value="${bookmark.bookmarkID}"></c:out></td>    
   		 <td><c:out value="${bookmark.bookmarkTitle}"></c:out></td> 
   		 <td><c:out value="${bookmark.bookmarkURL}"></c:out> </td> 
   		 <td><c:out value="${bookmark.bookmarkNote}"></c:out></td>  
   		 <td><c:out value="${bookmark.bookmarkTags}"></c:out></td>    
   		 <td>   <a href="javascript:deleteContact('deleteBookMark?id=${bookmark.bookmarkID}');">Delete</a></td>    
   		 </tr>
       </tbody>
    </table>
   
</body>
</html>