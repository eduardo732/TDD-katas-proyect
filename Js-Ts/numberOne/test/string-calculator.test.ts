import { add } from '../src/string-calculator';

describe('testing a kata1 file', () => {
	test('empty string should result in zero', () => {
		expect(add('')).toBe(0);
	});
	test('If there is one number, the result is the number', () => {
		expect(add('1')).toBe(1);
	});
	test('If there are more than one number, the funcion returns the total sum', 
	() => {
		expect(add('1,2,3')).toBe(6)
	});
	test('If there are negatives numbers throw a new RangeError', 
	() => {
		expect(() => add('-1,2,3')).toThrow(RangeError);
	})
});


