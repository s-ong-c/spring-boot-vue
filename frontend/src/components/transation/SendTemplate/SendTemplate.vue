<template>
    <div class="register-template">
        <div class="mock-header">
            <div to="/" class="brand">
                SONGC
            </div>
            <div class="light">
                <span>/</span>회원가입
            </div>
        </div>
        <section class="reset">
            <div class="register-card">
                <SendForm/>
            </div>
        </section>
    </div>
</template>

<script>
    import SendForm from '../SendForm';
    export default {
        components: {
            SendForm,
        }
    }
</script>

<style scoped  lang="scss">
 @import "./SendTemplate.scss";
</style>