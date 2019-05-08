import Vue from 'vue';
import Router from "vue-router"
import Home from "../views/Home.vue"
import TxView from "../views/TxView.vue"
Vue.use(Router);

export default new Router({
    mode:'history',
    routes: [
        {
            path: '/',
            name: 'Home',
            component: Home,
        },
        {
            path: '/Send',
            name: 'TxView',
            component: TxView,
        },
    ]
})


