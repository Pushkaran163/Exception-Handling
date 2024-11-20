try:
    result = 10 / 0
except ZeroDivisionError as e:
    print("Cannot divide by zero!")
except Exception as e:
    print("An unexpected error occurred.")
finally:
    print("Execution completed.")