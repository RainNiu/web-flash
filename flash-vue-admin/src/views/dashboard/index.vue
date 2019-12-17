<template>
  <div class="dashboard-container">
    <div class="dashboard-text">欢迎光临:{{name}} </div>
  </div>
</template>

<script src="./dashboard.js"></script>
<style rel="stylesheet/scss" lang="scss" scoped>
  .dashboard {
    &-container {
      padding: 15px;
      background-color: #f0f2f5;
    }
    &-text {
      font-size: 14px;
      line-height: 22px;
      padding-bottom:15px;
    }
  }
</style>
