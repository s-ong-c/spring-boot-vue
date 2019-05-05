<template>
  <div class="hello">

<!--    <h3 v-for="(user) in users" :key="user.id">-->
<!--     <router-link>{{user.name}} : {{user.phone}}</router-link>-->
<!--    </h3>-->
      <div v-for="user in this.$store.state.news">{{user}}</div>

  </div>
</template>

<script>

export default {
  name: 'HelloWorld',
  created() {
      this.$store.dispatch('FETCH_NEWS');
      const id = this.$route.params.id;
      console.log(id)
;

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
