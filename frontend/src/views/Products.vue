<template>
  <div>
    <div class="principal">
      <div class="principal">
        <h1>Products</h1>
      </div>

      <div class="table-responsive">
        <table class="table table-hover">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Name</th>
              <th scope="col">Amount</th>
              <th scope="col">Price</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="dado in dados" :key="dado.id">
              <th scope="row">{{ dado.id }}</th>
              <td>{{ dado.name }}</td>
              <td>{{ dado.amount }}</td>
              <td> {{dinheiro(dado.price )}}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
import dados from "./../data/data.json";
export default {
  data() {
    return {
      dados: dados,
    };
  },
  methods:{

    dinheiro(valor){
      return ' R$ ' + valor.toFixed(2);
    }
  }
};
</script>

<style lang="scss" scoped>
.principal {
  padding: 1%;
  padding-top: 0.1%;
  margin-top: -1%;
  
}
</style>
