import DS from 'ember-data';

const { attr } = DS;

export default DS.Model.extend({
  username: attr('string'),
  password: attr('string'),
  ssn: attr('number')
});
