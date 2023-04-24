console.log("kbkbknk");

let arr = [1, [2, 3], 4, [5, 6, [7, 8, 9, 10], 11], 12];
console.log(arr);
function customFlat(arr) {
  let result = [];
  arr.forEach((ar) => {
    if (Array.isArray(ar)) {
      result.push(...customFlat(ar));
    } else {
      result.push(ar);
    }
  });

  return result;
}

console.log(customFlat(arr));
