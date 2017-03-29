https://travis-ci.org/xuwei-k/apply-overload-2.11.9/jobs/216219063#L293

| 2.10.6 | 2.11.8 | 2.11.9 | 2.12.1 |
|--------|--------|--------|--------|
| OK     | OK     | Error  | Error  |


```
[error] /home/travis/build/xuwei-k/apply-overload-2.11.9/Test.scala:10: type mismatch;
[error]  found   : (Int, A) => example.Foo[A]
[error]  required: (Option[Int], A) => example.Foo[A]
[error]     Arbitrary(Gen.resultOf[Option[Int], A, Foo[A]](Foo.apply[A]))
[error]                                                             ^
[error] one error found
```

