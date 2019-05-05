import {phone} from '../api/index.js'

export default{
    // async FETCH_NEWS({commit}){
    //     return phone().
    //         then(response => {
    //             console.log(response.data);
    //         commit('SET_NEWS',response.data);
    //
    //     })
    //         .catch(error =>{
    //             console.log(error)
    //         })
    //     },
    //async
    async FETCH_NEWS(ctx){
        const response = await phone();
        ctx.commit('SET_NEWS',response.data);

        return response
    },



}