<template>
    <v-app>
      <v-main>
        <SearchPage />
      </v-main>
    </v-app>
  </template>
  
  <script>
  import SearchPage from './components/SearchPage.vue';
  
  export default {
    name: 'App',
    components: {
      SearchPage
    }
  }
  </script>
  