<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
	<title>消費税の計算</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<header>
		<h1>消費税の計算</h1>
	</header>
	<main>
		<div class="centerBlock">
			<div class="centerBlock">
				<table>
					<tr>
						<td class="back1">金額</td>
						<td class="back2">
						<jsp:getProperty name="DATA" property="money"/>
						</td>
					<tr>
						<td class="back1">税率</td>
						<td class="back2">
						<jsp:getProperty name="DATA" property="rate"/>
						</td>
					<tr>
						<td class="back1">消費税</td>
						<td class="back2">
						<jsp:getProperty name="DATA" property="tax"/>
						</td>
					<tr>
						<td class="back1">税込金額</td>
						<td class="back2">
						<jsp:getProperty name="DATA" property="WithTax"/>
						</td>
					<tr>
						<td></td>
						<td><a href="bmiform.html">戻る</td>
					</tr>
				</table>
			</div>
		</div>
		
	</main>
</body>
</html>