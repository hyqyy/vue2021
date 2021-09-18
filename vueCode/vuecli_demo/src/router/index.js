import Vue from 'vue'
import Router from 'vue-router'
import Index from '../components/Index'
import VueBase from "../components/VueBase";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect:'/index'
    },
    {
      path: '/index',
      name: 'Index',
      component: Index
    },
    {
      path: '/vuebase',
      name: 'VueBase',
      component: VueBase
    }
  ]
})
