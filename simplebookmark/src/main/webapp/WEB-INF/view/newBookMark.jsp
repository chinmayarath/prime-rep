<%@include file="/taglib.jsp" %>


 
<html>
<head>
<title>new BookMark</title>
 
</head>
<body style="font-family: Arial; font-size:smaller;">
 
	<table style="border-collapse: collapse;" width="750" align="center" bgcolor="lightblue" border="1" bordercolor="#006699" height="500">
		<tbody>
			<tr>   <td align="center"><h3>New Bookmark Form</h3></td>  </tr>
			<tr valign="top" align="center">     
				<td align="center">
 
					<form:form action="/saveBookMark" method="post" commandname="newBookMark">
						<table style="border-collapse: collapse;" width="500" border="0" bordercolor="#006699" cellpadding="2" cellspacing="2">
							<tbody>
								<tr>       <td width="100" align="right">Title</td>       
								<td width="150"> <form:input path="bookMarkTitle"></form:input></td>
								<td align="left"><form:errors path="bookMarkTitle" cssstyle="color:red"></form:errors></td>
 								</tr>
								<tr>       <td width="100" align="right">URL</td>       
								<td width="150"> <form:input path="bookMarkURL"></form:input></td>
								<td align="left"><form:errors path="bookMarkURL" cssstyle="color:red"></form:errors></td>
 								</tr>
								<tr>       <td width="100" align="right">Note</td>       
								<td width="150"> <form:input path="bookMarkNote"></form:input></td>
 								</tr>
								<tr>       <td width="100" align="right">Tag (Comma Separated)</td>       
								<td width="150"> <form:input path="Tags"></form:input></td>
								</tr>
								<tr>
								<td><input name="" value="Save" type="submit"></td>
								<td><input name="" value="Reset" type="reset"></td>
								<td><input value="Back" onclick="javascript:go('viewAllContacts');" type="button"></td>
								</tr>
							</tbody>
						</table>
					</form:form>
				</td>       
			</tr>
		</tbody>
	</table>
</body>
</html>