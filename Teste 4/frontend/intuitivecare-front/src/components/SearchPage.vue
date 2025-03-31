<template>
  <div class="container mt-3">
    <h1>Busca por Cidade</h1>
    <div class="mb-3">
      <label for="cityInput" class="form-label">Nome da Cidade</label>
      <input type="text" class="form-control" id="cityInput" v-model="cityName" placeholder="Digite o nome da cidade">
    </div>
    <button class="btn btn-primary" @click="fetchData">Buscar</button>

    <div v-if="operators.length" class="mt-3">
      <div v-for="operator in operators" :key="operator.ansRegistry" class="card mt-2">
        <div class="card-body">
          <h5 class="card-title">{{ operator.corporateName }}</h5>
          <p class="card-text">
            {{ operator.street }}, {{ operator.number }}
            <br>{{ operator.city }}, {{ operator.state }} - {{ operator.zipCode }}
            <br>Telefone: {{ operator.phone }}
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

import api from "@/services/api";
export default {
  data() {
    return {
      cityName: '',
      operators: []
    };
  },
  methods: {
    fetchData() {
      api.get(`/operator?city=${encodeURIComponent(this.cityName)}`)
        .then(response => {
          this.operators = response.data;
        })
        .catch(error => {
          console.error('Erro ao buscar dados:', error);
          alert('Erro ao buscar operadores. Verifique o console para mais detalhes.');
        });
    }
  }
}
</script>
