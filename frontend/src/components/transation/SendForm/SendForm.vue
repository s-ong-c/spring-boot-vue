<template>
    <div>
        <div class="register-form">
            <div class="form-head">
                <h2>기본 회원정보 등록</h2>
            </div>
            <div class="form-contents">
                <input value={displayName} name="displayName"   placeholder="이름을 입력하세요" >
                <input type="email" value="somony9292@gmail.com" name="email"  placeholder="이메일을 입력하세요" />
                <input name="username"   placeholder="아이디를 입력하세요!"  />
                <input  name="shortBio"  placeholder="한줄 소개를 입력하세요"  />
                <div class="agreement">
                    다음 버튼을 누르면 <span>서비스 이용약관 </span>과  <span> 개인정보취급방침</span>에 동의하는 것을 인정합니다.
                </div>
                <div class="button-wrapper">
                    <div class="icon-button">
                        <span>다음</span>

                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "SendForm"
    }
</script>

<style scoped>

</style>