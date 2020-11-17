import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import grxx from '@/view/grxx'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'grxx',
      component: grxx
    },
    {
      path: '/grxx',
      name: 'grxx',
      component: grxx
    }
  ]
})
