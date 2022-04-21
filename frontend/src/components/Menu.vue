<template>
  <div class="conteudo">
    <ul>
      <router-link to="/">
        <li>
          <img src="./../assets/fullstack.png" width="80" alt="curse fulstack">
        </li>
      </router-link>

      <router-link to="/about">
        <li>Sobre</li>
      </router-link>

      <router-link to="/categories">
        <li>Categorias</li>
      </router-link>

      <router-link to="/products">
        <li>Produtos</li>
      </router-link>
    </ul>
  </div>
</template>

<script>
export default {};
</script>

<style lang="scss" scoped>
.conteudo{
  ul{
    display: flex;
    list-style: none;
    justify-content: space-around;
    align-items: center;
    li{
      margin-left: 1%;
      width: 100px;



    }
  }
}

</style>