const name = prompt("Enter a person's name:");
const place = prompt("Enter a place:");
const adjective = prompt("Enter an adjective:");
const noun = prompt("Enter a noun:");
const verb = prompt("Enter a verb (past tense):");
const emotion = prompt("Enter an emotion:");

const story = `
  <h3>The book of ${name}</h3>
  <p>One day, <strong>${name}</strong> pulled up to the local <strong>${place}</strong>.
  They then felt the presence of the ${adjective} opps, so they brought a ${noun}.
  They ${verb} all at the opps until they felt ${emotion}.
  The opps will remember this day as the day they fell by the hands of <strong>${name}</strong></p>
`;

document.getElementById("madlib-output").innerHTML = story;
