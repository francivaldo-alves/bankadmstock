<template>
  <div>
    <div class="categoria">
       <h1>Categorias</h1>
       <div class="list">
         {{categories}}


       





          <div class="table-responsive">
        <table class="table table-hover">
          <thead>
            <tr>
              <th scope="col6">#</th>
              <th scope="col6">Name</th>
           
            </tr>
          </thead>
          <tbody>
            <tr v-for="categoria in categories" :key="categoria.id">
              <th scope="row">{{ categoria.id }}</th>
              <td>{{ categoria.name }}</td>

            </tr>
          </tbody>
        </table>
      </div>

       </div>
    </div>
     
  </div>


  <div class="container">
    <div  v-for="categoria in categories" :key="categoria.id">
  <ul class="list-group">
  <li class="list-group-item">{{categoria.name}}</li>
  
</ul>
</div>
  </div>
</template>

<script>
 import axios from 'axios'
export default {
  data(){
    return {
        categories:{}
    }
  
  },
  methods:{
    getCategoria(){
      axios.get('http://localhost:8081/caregories').then(resp =>{
        this.categories = resp.data
      })
    }
  },
  created(){
    this.getCategoria()
  }
}
</script>

<style>

</style>