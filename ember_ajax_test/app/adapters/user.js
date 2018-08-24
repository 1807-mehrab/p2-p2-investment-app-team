import DS from 'ember-data';

export default DS.RESTAdapter.extend({
  host: 'http://18.216.154.149:8080',
  namespace: 'HelloWorld',
  pathForType() {
    return 'users';
  }
});
