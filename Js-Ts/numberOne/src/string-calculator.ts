export const add = (word:string) => {
	if(word === '') return 0;
	const arr = word.split(',').map(el => parseInt(el));
	const negatives = arr.filter(x => x < 0);
	if(negatives.length > 0) throw new RangeError('Negatives are not allowed');
	const sum = arr.reduce((acc, el) => acc + el, 0);
	return sum;
}