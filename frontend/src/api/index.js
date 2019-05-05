import axios from 'axios'
import Vue from 'vue';


// HTTP Request & Response 와 관련된 기본 설정
const config = {
    baseUrl: 'http://localhost:8080',
};
// 2. API 함수들을 정리
async function phone(){

    return  await axios.get(`${config.baseUrl}/api/users`)

}


export {
    phone,

}