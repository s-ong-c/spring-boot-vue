import Vue from 'vue'
import Vuex from 'vuex'
//import actions from './actions.js'
import {phone} from '../api/index.js'
Vue.use(Vuex);

// export const store = new Vuex.Store({
//     state:{
//         new:[],
//     },
//     mutations,
//     actions,
// });

export const store = new Vuex.Store({
    state:{
        news:{},
    },
    mutations:{
        SET_NEWS(state, news){
            state.news = news
        }
    },
    actions:{
        FETCH_NEWS(ctx){
            phone().
            then(response => {
                ctx.commit('SET_NEWS',response.data);
            })
                .catch(error =>{
                    console.log(error)
                })
        }
    }
});