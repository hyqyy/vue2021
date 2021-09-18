<template>
<div><h1 style="text-align: center">{{title}}</h1>
  <div style="text-align: center">
    <router-link :to="{name:'VueBase'}">{{lists[0]}}</router-link>
    <router-link to="">{{lists[1]}}</router-link>&nbsp;&nbsp;
    <router-link to="">{{lists[2]}}</router-link>&nbsp;&nbsp;
    <router-link to="">{{lists[3]}}</router-link>&nbsp;&nbsp;
    <router-link to="">{{lists[4]}}</router-link>&nbsp;&nbsp;
    <router-link to="">{{lists[5]}}</router-link>&nbsp;&nbsp;
    <router-link to="">{{lists[6]}}</router-link>&nbsp;&nbsp;
    <router-link to="">{{lists[7]}}</router-link></div>
  <hr>


</div>
</template>

<script>
export default {
  name: "Index",
  data(){
    return {
      title:"vue系统复习demo",
      lists:["vue基础","vue路由","vue组件","vue脚手架","vueX","引入CSS","引入axios","引入element-ui"]
    }
  }
}
</script>

<style scoped>

</style>
