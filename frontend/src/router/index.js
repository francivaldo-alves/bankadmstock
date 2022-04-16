import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
   
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },

  {
    path: '/products',
    name: 'products',
   
    component: () => import(/* webpackChunkName: "about" */ '../views/Products.vue')
  },
  {
    path: '/categories',
    name: 'categories',
   
    component: () => import(/* webpackChunkName: "about" */ '../views/Categories.vue')
  }

  
  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
