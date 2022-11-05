<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container-fluid">
	<div class="row mt-4">
		<div class="col-md-10 offset-md-1">
			<h1>게시글 작성</h1>
			<p class="text-secondary">
				글은 자신의 인격입니다
			</p>
		</div>
	</div>

	<form method="post">
	
	<div class="row mt-4">
		<div class="col-md-10 offset-md-1">
			<div class="form-floating">
				<input name="writer" type="text" class="form-control" placeholder="작성자" required>
				<label class="form-label text-secondary">작성자</label>
			</div>
		</div>
	</div>
		
		<div class="row mt-4">
			<div class="col-md-10 offset-md-1">
			<div class="form-floating">
				<input name="title" type="text" class="form-control" placeholder="제목" required>
				<label class="form-label text-secondary">제목</label>
			</div>
	</div>
	
	<div class="row mt-4">
		<div class="col-md-10 offset-md-1">
			<textarea name="content" class="form-control" rows="15" placeholder="내용 작성" required></textarea>
		</div>
	</div>
	
	<!-- 비밀번호 입력 창 추가 -->
	<div class="row mt-4">
		<div class="col-md-10 offset-md-1">
				<div class="form-floating">
					<input type="password" name="password" class="form-control" placeholder="비밀번호" required>
					<label class="form-label text-secondary">비밀번호</label>
			</div>
		</div>
	</div>
	
	<div class="row mt-4">
		<div class="col-md-10 offset-md-1 text-end">
			<a href="./" type="button" class="btn btn-secondary btn-lg">목록</a>
			<button type="submit" class="btn btn-primary">등록</button>
		</div>
	</div>	
</div>

</form>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

<h1>게시글 작성</h1>

<form method="post">

	<input type="text" name="writer" placeholder="작성자"required><br><br>
	<input type="text" name="title" placeholder="제목" required><br><br>
	<textarea name="content" placeholder="내용" rows="5" cols="60" required></textarea><br><br>
	<button type="submit">등록</button>

</form>