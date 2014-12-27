package by.htp.krozov.homework.matrix;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Arithmetic matrix.
 * Class is unmodifiable. Every modification operation create new Matrix object as a result.
 *
 * @param <E> Type of items.
 */
@SuppressWarnings("unchecked")
public class Matrix<E> {
    private final Size size;

    // Keep values as object of array.
    // If we keep values as E[][], we will need create Class<E> object for create it via reflection.
    private final Object[][] values;

    /**
     * Create square matrix.
     *
     * @param size Matrix size. Number of columns is equals number of rows.
     */
    public Matrix(int size) {
        this(new Size(size));
    }

    public Matrix(@NotNull Matrix matrix) {
        this.size = new Size(matrix.size);
        this.values = new Object[matrix.size.rows][matrix.size.columns];
        System.arraycopy(matrix.values, 0, this.values, 0, matrix.values.length);
    }

    /**
     * Create matrix.
     *
     * @param rows    Number of rows.
     * @param columns Number of columns.
     */
    public Matrix(int rows, int columns) {
        this(new Size(rows, columns));
    }

    private Matrix(@NotNull Size size) {
        this.size = new Size(size);
        this.values = new Object[size.rows][size.columns];
    }

    public E get(int row, int column) {
        if (size.isInBounds(row, column)) {
            return (E) values[row - 1][column - 1];
        } else {
            throw new RuntimeException("Can't get item. Item position isn't valid.");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < size.rows; row++) {
            for (int columns = 0; columns < size.columns; columns++) {
                builder.append(String.format("%6d", values[row][columns]));
            }
            builder.append('\n');
        }
        return builder.toString();
    }

    public void set(int row, int column, E value) {
        if (size.isInBounds(row, column)) {
            values[row - 1][column - 1] = value;
        } else {
            throw new RuntimeException("Can't set item. Item position isn't valid.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Matrix matrix = (Matrix) o;
        return Arrays.deepEquals(values, matrix.values);

    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(values);
    }

    public Size getSize() {
        return size;
    }

    /**
     * Representation of matrix size.
     */
    public static class Size {
        public final int rows;
        public final int columns;

        private Size(int rows) {
            this(rows, rows);
        }

        private Size(@NotNull Size size) {
            this.rows = size.rows;
            this.columns = size.columns;
        }

        private Size(int rows, int columns) {
            if (rows < 1 || columns < 1) {
                throw new RuntimeException(
                        String.format("Illegal size of matrix (%d, %d)", rows, columns));
            }
            this.rows = rows;
            this.columns = columns;
        }

        private boolean isInBounds(int row, int column) {
            return 1 <= row && row <= rows
                    && 1 <= column && column <= columns;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Size size = (Size) o;
            return columns == size.columns && rows == size.rows;

        }

        @Override
        public int hashCode() {
            return 31 * rows + columns;
        }
    }
}
